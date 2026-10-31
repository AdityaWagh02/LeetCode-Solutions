class Solution {
    public int addDigits(int num) {
    
    while(num>=10){
        int temp=num;
        int m=num%10;
        int o=temp/10;
        num=o+m;
        if(num>=10){
            addDigits(num);
        }
        else{
        return num; 
        }
    }
    
     return num;
    }
}