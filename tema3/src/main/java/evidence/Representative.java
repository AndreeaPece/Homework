package evidence;

public class Representative {
    // Variables that make reference to sales employee, number of sales, quota and revenues
    private String employee;
    private int nbsales;
    private int quota;
    private int revenue;

    public Representative(String employee, int nbsales, int quota, int revenue) {
        this.employee = employee;
        this.nbsales = nbsales;
        this.quota = quota;
        this.revenue = revenue;

    }

    //Get and set method for each instance variables

    public String getEmployee(){
        return employee;
    }

    public void setEmployee(String employee){
        this.employee = employee;
    }

    public int getNbsales(){
        return nbsales;
    }

    public void setNbsales(int nbsales){
        this.nbsales = nbsales;
    }

    public int getQuota(){
        return quota;
    }

    public void setQuota(int quota){
        this.quota = quota;
    }

    public int getRevenue(){
        return revenue;
    }

    public void setRevenue(int revenue){
        this.revenue = revenue;
    }

    public String toString (){
        return("Employee:" + employee + " Nbsales:" + nbsales + " Quota:" + quota + " Revenue:" + revenue);
    }

} // end of class Representative
