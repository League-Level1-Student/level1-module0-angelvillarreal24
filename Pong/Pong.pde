float xPos, xSpeed, PongScore;
void setup(){
  size(1000, 1000); 
  xSpeed = 5;
}

void draw(){
  System.out.println(xSpeed);
  background(0);
  PongBall();
  xPos += xSpeed;
  if(xPos<0){
   xSpeed*=-1; 
  }else if(xPos>width){
   xSpeed*=-1; 
  }
}