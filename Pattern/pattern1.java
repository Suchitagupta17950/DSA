class Solution {
    public void pattern1(int n) {
        for(int i=0;i<n;i++){
            StringBuilder row=new StringBuilder();
            for(int j=0; j<n;j++){
                row.append("*");

            }
            System.out.println(row);
        }

    }
}