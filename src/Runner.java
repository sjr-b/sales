public class Runner {

    public static void main (String[] args){

    }

    public SalesPerson[] salesPeople = new SalesPerson[1000];

    public String highest(SalesPerson [] salesPeople){
        String id = "";
        double amount = 0;
        for (int a = 0; a < salesPeople.length; a++){
            if (salesPeople[a].largestSale().getValue() * salesPeople[a].largestSale().getQuantity() > amount){
                amount = salesPeople[a].largestSale().getQuantity() * salesPeople[a].largestSale().getValue();
                id = salesPeople[a].getId();
            }
        }
        return id;
    }

    public void addSales (Sales s, String id){
        for (int a = 0; a < salesPeople.length; a++){
               if (salesPeople[a].getId().equals(id)){
                   salesPeople[a].setSalesHistory(s);
               }
        }
    }

}
