import tech.tablesaw.api.*;
import java.io.IOException;

public class TableSawEx {
    private String path;
    private Table TData;
    TableSawEx(String path) throws IOException {
        this.path=path;
        Table TData = Table.read().csv(path);
        this.TData=TData;
    }
    public void readTable(){
        System.out.println(TData.first(5)+"\n\n\n");
    }
    public void columnMean(String name){
        System.out.println(TData.nCol(name).mean());
    }
    public void summary(){
        System.out.println(TData.summary());
    }
    public void maxmin(String name){
        System.out.println(TData.nCol(name).max());
        System.out.println(TData.nCol(name).min());
    }


}
