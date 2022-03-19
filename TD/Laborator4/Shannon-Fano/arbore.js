// Sample of how the compression tree should look like.
// A0 is the father (the root of the tree)
// each level introduce a byte in the final code 
// each node could have maximum 2 children (L - left (introduce a "0") and 
// R - right (introduce a "1"))
// the node name should contain the name of previous visited nodes.
// ex.: A0LR - Level 2, code: 01

function exists(a,x)
{
  var i;
  for(i=0;i<x.length;i++)
  {
    if(x[i]==a)
      return i;
  }
  return -1;
}

function deep(nod)
{
  if(nod.length==1)
  {
    return nod[0];
  }

  var sum=0;
  var k;
  for(k=0;k<nod.length;k++)
  {
    sum+=nod[k].frequency;
  }
  var nod1=[],nod2=[];
  var m=Math.floor((nod.length+1)/2);
  for(k=0;k<m;k++)
  {
    nod1[nod1.length]=nod[k];
  }
  for(k=m;k<nod.length;k++)
  {
    nod2[nod2.length]=nod[k];
  }

  var node={
    "frequency":sum,
    "data":"level"+k,
    "left":deep(nod1),
    "right":deep(nod2)
  }
 
  return node;

}

function procesare()
{
  var val=document.getElementById("message").value;//preluarea sirului de caractere
  var i,k,f=0;
  var c=0;
  var caracter=[];
  var frecventa=[];
  for(i=0;i<val.length;i++)
  {
    k=exists(val[i],caracter);
    if(k==-1)
    {
      caracter[c]=val[i]; //separarea caracterelor din sir
      c++;
      frecventa[f]=1; //frecventa fiecarui caracter din sir
      f++;
    }
    else
    {
      frecventa[k]=frecventa[k]+1;
    }
  }
 
  var aux1,aux2;
  var ok=0;
  while(ok==0) //ordonarea celor 2 vectori in functie de frecventa
  {
    ok=1;
    for(i=0;i<f;i++)
    {
      if(frecventa[i]<frecventa[i+1])
      {
        ok=0;
        aux1=frecventa[i];
        frecventa[i]=frecventa[i+1];
        frecventa[i+1]=aux1;
        aux2=caracter[i];
        caracter[i]=caracter[i+1];
        caracter[i+1]=aux2;
      }
      else if(frecventa[i]==frecventa[i+1])
      {
        if(caracter[i]>caracter[i+1])
        {
          ok=0;
          aux1=frecventa[i];
          frecventa[i]=frecventa[i+1];
          frecventa[i+1]=aux1;
          aux2=caracter[i];
          caracter[i]=caracter[i+1];
          caracter[i+1]=aux2;
        }
      }
    }
  }
  for (i=0;i<c;i++)
  {
    if(caracter[i]==" ")
    {
      document.getElementById("caractere").innerHTML +="' '"+" ";
    }
    else
    {
      document.getElementById("caractere").innerHTML +=caracter[i]+" ";
    }    
  }
  for (i=0;i<f;i++)
  {
    document.getElementById("frecvente").innerHTML +=frecventa[i]+"|";
  }

  var nods=[];
  var n=0;
  var sumt=0;
  for(i=0;i<c;i++)
  {
    var nod=
    {
      "frequency":frecventa[i],
      "character":caracter[i],
      "left":null,
      "right":null
    }
    nods[n]=nod;
    n++;
    sumt +=frecventa[i];
  }

  var summ=Math.floor(sumt/2);
  var sum=0;
  i=f;
  while(sum<summ)
  {
    sum+=frecventa[i-1];
    i--;
  }
  var nod1=[],nod2=[];
  var j=0;
  for(j=0;j<i;j++)
  {
    nod1[nod1.length]=nods[j];
  }
  for(j=i;j<n;j++)
  {
    nod2[nod2.length]=nods[j];
  }

  var root={
    "frequency":sumt,
    "data":"root",
    "left": deep(nod1),
    "right": deep(nod2)
  }
console.log(root);
}



// binary tree "IT IS BETTER LATER THAN NEVER"
var treeData =
  {
    "name": "A0",
    "children": [
      {
        "name": "Level 1: A0R",
        "children": [
          { "name": "Level 2: A0RR",
              "children": [
                { "name": "Level 3: A0RRR",
                    "children": [
                      { "name": "Level 4: A0RRRR",
                          "children": [
                            { "name": "Level 5: A0RRRRR = V" },
                            { "name": "Level 5: A0RRRRL = S" }
                          ]
                      },
                      { "name": "Level 4: A0RRRL",
                          "children": [
                            { "name": "Level 5: A0RRRLR = L" },
                            { "name": "Level 5: A0RRRLL = H" }
                          ]
                      }
                    ]
                },
                { "name": "Level 3: A0RRL",
                    "children": [
                      { "name": "Level 4: A0RRLR",
                          "children": [
                            { "name": "Level 5: A0RRLRR = B" },
                            { "name": "Level 5: A0RRLRL = ." }
                          ]
                      },
                      { "name": "Level 4: A0RRLL = N" }
                    ]
                }
              ]
          },
          { "name": "Level 2: A0RL",
              "children": [
                { "name": "Level 3: A0RLR",
                    "children": [
                      { "name": "Level 4: A0RLRR = I" },
                      { "name": "Level 4: A0RLRL = A" }
                    ]
                },
                { "name": "Level 3: A0RLL = R" }
              ]
          }
        ]
      },
      { "name": "Level 1: A0L",
        "children": [
          { "name": "Level 2: A0LR",
              "children": [
                { "name": "Level 3: A0LRR = T" },
                { "name": "Level 3: A0LRL = E" }
              ]
         },
          { "name": "Level 2: A0LL = spatiu" }
        ]
	  }
    ]
  };

// Set the dimensions and margins of the diagram
var margin = {top: 20, right: 90, bottom: 30, left: 90},
    width = 3060 - margin.left - margin.right,
    height = 1000 - margin.top - margin.bottom;

	
// append the svg object to the body of the page
// appends a 'group' element to 'svg'
// moves the 'group' element to the top left margin
var svg = d3.select("body").append("svg")
    .attr("width", width + margin.right + margin.left)
    .attr("height", height + margin.top + margin.bottom)
  .append("g")
    .attr("transform", "translate("
          + margin.left + "," + margin.top + ")");

var i = 0,
    duration = 750,
    root;

// declares a tree layout and assigns the size
var treemap = d3.tree().size([height, width]);

// Assigns parent, children, height, depth
root = d3.hierarchy(treeData, function(d) { return d.children; });
root.x0 = height / 2;
root.y0 = 0;

// Collapse after the second level
root.children.forEach(collapse);

update(root);

// Collapse the node and all it's children
function collapse(d) {
  if(d.children) {
    d._children = d.children
    d._children.forEach(collapse)
    d.children = null
  }
}

function update(source) {

  // Assigns the x and y position for the nodes
  var treeData = treemap(root);

  // Compute the new tree layout.
  var nodes = treeData.descendants(),
      links = treeData.descendants().slice(1);

  // Normalize for fixed-depth.
  nodes.forEach(function(d){ d.y = d.depth * 180});

  // ****************** Nodes section ***************************

  // Update the nodes...
  var node = svg.selectAll('g.node')
      .data(nodes, function(d) {return d.id || (d.id = ++i); });

  // Enter any new modes at the parent's previous position.
  var nodeEnter = node.enter().append('g')
      .attr('class', 'node')
      .attr("transform", function(d) {
        return "translate(" + source.y0 + "," + source.x0 + ")";
    })
    .on('click', click);

  // Add Circle for the nodes
  nodeEnter.append('circle')
      .attr('class', 'node')
      .attr('r', 1e-6)
      .style("fill", function(d) {
          return d._children ? "lightsteelblue" : "#fff";
      });

  // Add labels for the nodes
  nodeEnter.append('text')
      .attr("dy", ".35em")
      .attr("x", function(d) {
          return d.children || d._children ? -13 : 13;
      })
      .attr("text-anchor", function(d) {
          return d.children || d._children ? "end" : "start";
      })
      .text(function(d) { return d.data.name; });

  // UPDATE
  var nodeUpdate = nodeEnter.merge(node);

  // Transition to the proper position for the node
  nodeUpdate.transition()
    .duration(duration)
    .attr("transform", function(d) { 
        return "translate(" + d.y + "," + d.x + ")";
     });

  // Update the node attributes and style
  nodeUpdate.select('circle.node')
    .attr('r', 10)
    .style("fill", function(d) {
        return d._children ? "lightsteelblue" : "#fff";
    })
    .attr('cursor', 'pointer');


  // Remove any exiting nodes
  var nodeExit = node.exit().transition()
      .duration(duration)
      .attr("transform", function(d) {
          return "translate(" + source.y + "," + source.x + ")";
      })
      .remove();

  // On exit reduce the node circles size to 0
  nodeExit.select('circle')
    .attr('r', 1e-6);

  // On exit reduce the opacity of text labels
  nodeExit.select('text')
    .style('fill-opacity', 1e-6);

  // ****************** links section ***************************

  // Update the links...
  var link = svg.selectAll('path.link')
      .data(links, function(d) { return d.id; });

  // Enter any new links at the parent's previous position.
  var linkEnter = link.enter().insert('path', "g")
      .attr("class", "link")
      .attr('d', function(d){
        var o = {x: source.x0, y: source.y0}
        return diagonal(o, o)
      });

  // UPDATE
  var linkUpdate = linkEnter.merge(link);

  // Transition back to the parent element position
  linkUpdate.transition()
      .duration(duration)
      .attr('d', function(d){ return diagonal(d, d.parent) });

  // Remove any exiting links
  var linkExit = link.exit().transition()
      .duration(duration)
      .attr('d', function(d) {
        var o = {x: source.x, y: source.y}
        return diagonal(o, o)
      })
      .remove();

  // Store the old positions for transition.
  nodes.forEach(function(d){
    d.x0 = d.x;
    d.y0 = d.y;
  });

  // Creates a curved (diagonal) path from parent to the child nodes
  function diagonal(s, d) {

    path = `M ${s.y} ${s.x}
            C ${(s.y + d.y) / 2} ${s.x},
              ${(s.y + d.y) / 2} ${d.x},
              ${d.y} ${d.x}`

    return path
  }

  // Toggle children on click.
  function click(d) {
    if (d.children) {
        d._children = d.children;
        d.children = null;
      } else {
        d.children = d._children;
        d._children = null;
      }
    update(d);
  }
}
