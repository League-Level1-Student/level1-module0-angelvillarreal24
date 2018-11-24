 int yPos = 0;
void setup(){
 size(1000,1000); 
  
  
}
void draw(){
  background(160,160,160);
  fill(0, 0, 255);
  stroke(00, 0, 0);
  ellipse(500, yPos, 50, 75);
   yPos += 10;
   System.out.println(yPos);
   if(yPos==1000){
   yPos = 0; 
   }
  }