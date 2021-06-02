import joinery.DataFrame;

import java.io.IOException;

public class JoineryEx {
    private DataFrame<Object>df;
    private String Path;

    JoineryEx(String Path) throws IOException {
        this.Path=Path;
        DataFrame<Object> df = DataFrame.readCsv(Path);
        this.df=df;
    }
    public void columnMean(String name){
        System.out.println(df.retain(name).mean());
    }
    public void tableMean(){
        System.out.println(df.mean());
    }
    public void columnMinMax(String name){
        System.out.println(df.retain(name).max());
        System.out.println(df.retain(name).min());
    }
    public void tableMinMax(){
        System.out.println(df.max());
        System.out.println(df.min());
    }
    public void columnStd(String name){
        System.out.println(df.retain(name).stddev());
    }
    public void tableStd(){
        System.out.println(df.stddev());
    }
    public void table(){
        System.out.println(df);
    }


}
