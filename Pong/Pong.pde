import ddf.minim.*;  
Minim minim;
AudioSample sound;
//PImage backgroundImage;
int xPos, xSpeed, yPos, ySpeed, PongScore;
int pongBallSize = 45;
int paddleLength = 100;
void setup() {
  minim = new Minim (this);
  sound = minim.loadSample("pong.wav", 128);
  //backgroundImage = loadImage("Pong.jpg");
  size(1000, 1000); 
  xSpeed = 10;
  ySpeed = 11;
  yPos = 500;
  xPos = 500;
  
}

void draw() {
  //image(backgroundImage, 0, 0);
  //image(backgroundImage, 0, 0, width, height);
 // System.out.println(xSpeed);
  background(0);
  PongBall();
  rect(mouseX,900,paddleLength,25); 
  xPos += xSpeed;
  yPos += ySpeed;  
  boolean intersect = intersects( xPos, yPos,mouseX,900,paddleLength);
  if(intersect){
   ySpeed*=-1;
    sound.trigger();
    System.out.println("this worked");
  }
  
  if (xPos-pongBallSize/2<0) {
    xSpeed*=-1;
    sound.trigger();
  } else if (xPos+pongBallSize/2>width) {
    xSpeed*=-1;
    sound.trigger();
  }
  if (yPos-pongBallSize/2<0) {
    ySpeed*=-1;
    sound.trigger();
  } else if (yPos+pongBallSize/2>height) {
    ySpeed*=-1;
    sound.trigger();
  }
}
boolean intersects(int ballX, int ballY, int paddleX, int paddleY, int paddleLength) {
     if (ballY > paddleY && ballX > paddleX && ballX < paddleX + paddleLength){
       System.out.println(ballX);
          return true;
     }
     else{ 
          return false;
     }
}