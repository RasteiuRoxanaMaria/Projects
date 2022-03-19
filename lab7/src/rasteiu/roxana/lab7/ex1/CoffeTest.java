package rasteiu.roxana.lab7.ex1;

public class CoffeTest {
    public static void main(String[] args) throws Exception{
        CofeeMaker mk=new CofeeMaker();
        CofeeDrinker d=new CofeeDrinker();

        for(int i=0;i<5;i++){
            Cofee c=null;
            try
            {
                c = mk.makeCofee();
            }
            catch (NumberException e)
            {
                System.out.println("Exception:"+e.getMessage()+" inst="+e.getNumber());
            }
            finally
            {
                System.out.println("Throw the cofee cup.\n");
            }
            if(c!=null)
            try{
                d.drinkCofee(c);
            } catch (TemperatureException e){
                System.out.println("Exception: "+e.getMessage()+ "temp= "+e.getTemp());
            } catch (ConcentrationException e) {
                System.out.println("Exception:"+e.getMessage()+" conc="+e.getConc());
            } finally{
                System.out.println("Throw the cofee cup.\n");
            };
        }
    }
}
