#Q-1: Average Salary Excluding the Minimum and Maximum Salary?
class Solution {
    public double average(int[] salary) {
        double min = salary[0]; //1000
        double max = salary[0]; //1000
        double total = 0;

        for(int i=0; i<salary.length; i++){
            if(salary[i]<min){
                min=salary[i];//1000
            }
            if(salary[i]>max){
                max=salary[i];//3000
            }
            total=total+salary[i];//6000
        }
        total = (total-min-max)/(salary.length-2);//(60000-1000-3000)/(3-2)
        
        return total;
    }
}
