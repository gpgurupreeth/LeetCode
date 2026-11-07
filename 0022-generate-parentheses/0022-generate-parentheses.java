class Solution {
    public static void generate(List<String> result,int first,int last,int max,String str){
        if(str.length()==2*max){
            result.add(str);
            return;
        }
        if(first<max){
            generate(result,first+1,last,max,str+"(");
        }
        if(last<first){
            generate(result,first,last+1,max,str+")");
        }
    }

    public List<String> generateParenthesis(int n) {
        List<String> result=new ArrayList<>();
        int first=0;
        int last=0;
        int max=n;
        String str="";
        generate(result,first,last,max,str);
        return result;
    }
}