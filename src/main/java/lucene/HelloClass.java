package lucene;

import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.standard.StandardAnalyzer;
import org.apache.lucene.index.CorruptIndexException;
import org.apache.lucene.index.IndexWriter;
import org.apache.lucene.index.IndexWriterConfig;
import org.apache.lucene.store.Directory;
import org.apache.lucene.store.RAMDirectory;
import org.apache.lucene.util.Version;

import java.io.IOException;

/**
 * Created by chenyingxi on 14-3-9.
 */
public class HelloClass {
    public void index(){
        //1.创建Directory
        Directory directory=new RAMDirectory();
        //2.创建indexWriter
        Analyzer analyzer = new StandardAnalyzer(Version.LUCENE_35);
        IndexWriterConfig iwc=new IndexWriterConfig(Version.LUCENE_35,analyzer);
        IndexWriter indexWriter=null;
        try {
            indexWriter =new IndexWriter(directory,iwc);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(indexWriter!=null) try {
                indexWriter.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        //3.创建Document对象
        //4为Document添加Field
        //5.通过indexWriter添加文档到索引中
    }
}
