var app = new Vue({
    el: '#app',
    data: {
        users: [],
        usersService: null
    },
    created: function () {
        usersService = users();
        usersService.get().then(response => (this.users = response.data));
    },
    methods: {
        adduser: function(){
          data={
            "name": document.getElementById("name").value,
            "city": document.getElementById("city").value
          }
          axios.put('http://localhost:3000/users',data);
          users();
          window.location.reload();
        },
        deleteuser: function(){
          var numar=parseInt(document.getElementById("index").value);
          axios.delete('http://localhost:3000/users/'+parseInt(numar));
          window.location.reload();
        },
        modifyuser: function(){
          data={
            "name": document.getElementById("name").value,
            "city": document.getElementById("city").value
          }
          var numar=parseInt(document.getElementById("index").value);
          axios.put('http://localhost:3000/users/'+parseInt(numar),data);
          users();
          window.location.reload();
        }

    }
})