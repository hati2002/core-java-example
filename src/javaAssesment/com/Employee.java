package javaAssesment.com;

public class Employee {
    int rating;
   int startYear;

   Employee(int rating,int startYear){
       this.rating=rating;
       this.startYear=startYear;
   }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void idCreate(){
        System.out.println("id is created");
    }
    @Override
    public String toString() {
        return "Employee{" +
                "rating=" + rating +
                ", startYear=" + startYear +
                '}';
    }

}
