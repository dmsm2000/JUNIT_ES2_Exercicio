public class BinString{


    public String convert(String s){
        return binarise(sum(s));
    }

    public int sum(String s){
        if(s == "") return 0;
        if (s.length() == 1) return ((int) s.charAt(0));
        return (((int) s.charAt(0))) + sum(s.substring(1));
    }

    public String binarise(int x){
        String s = "";
        while (x > 0)
        {
            s =  ( (x % 2 ) == 0 ? "0" : "1") +s;
            x = x / 2;
        }
        return s;
    }
}
