package nio;

import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.util.List;
public class WatchServiceExample {
       public static void main(String[] args) throws IOException, InterruptedException {
              Path path = Paths.get("E:\\sample");
              FileSystem fileSystem = FileSystems.getDefault();
              WatchService watchService = fileSystem.newWatchService();
              path.register(watchService, StandardWatchEventKinds.ENTRY_CREATE,StandardWatchEventKinds.ENTRY_MODIFY,
                           StandardWatchEventKinds.ENTRY_DELETE);
              while(true){
                WatchKey watchKey = watchService.take();
                List<WatchEvent<?>> watchEvents = watchKey.pollEvents();
                for (WatchEvent<?> we: watchEvents){
                     if(we.kind() == StandardWatchEventKinds.ENTRY_CREATE){
                            System.out.println("Created: "+we.context());
                     }else if (we.kind() == StandardWatchEventKinds.ENTRY_DELETE){
                            System.out.println("Deleted: "+we.context());
                     } else if(we.kind() == StandardWatchEventKinds.ENTRY_MODIFY){
                            System.out.println("Modified :"+we.context());
                     }
                }
                if(!watchKey.reset()){
                     break;
                }
              }
       }
}
 