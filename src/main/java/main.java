import java.io.IOException;

public class main {
    public static void main(String[] args) throws IOException {
        String Path="Data\\titanic.csv";
        TableSawEx data=new TableSawEx(Path);
        data.readTable();
        data.columnMean("age");
        data.maxmin("age");
        data.summary();


        JoineryEx dataf=new JoineryEx(Path);
        dataf.table();
        dataf.tableMean();
        dataf.columnStd("Age");
        dataf.tableMinMax();
    }
}
