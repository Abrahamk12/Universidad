package prácticas_threads_03;
/*
Total de lineas?
*/
public class Counter {
    
     protected long count = 0;
     
     public Counter() {
         this.count = 0;
     }
     
     public Counter(long n) {
         this.count = n;
         
     }

     public void add(long value){
         this.count = this.count + value;
     }
     
     public long get() {
         return this.count;
     }
    
}
