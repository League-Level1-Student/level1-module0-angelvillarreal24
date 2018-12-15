import ddf.minim.*;  
Minim minim;
AudioSample sound;
//PImage backgroundImage;
float xPos, xSpeed, yPos, ySpeed, PongScore;
float pongBallSize = 45;
void setup() {
  minim = new Minim (this);
  sound = minim.loadSample("pong.wav", 128);
  //backgroundImage = loadImage("Pong.jpg");
  size(1000, 1000); 
  xSpeed = random(50);
  ySpeed = random(50);
  yPos = random(height);
  xPos = random(width);
}

void draw() {
  //image(backgroundImage, 0, 0);
  //image(backgroundImage, 0, 0, width, height);
  System.out.println(xSpeed);
  background(0);
  PongBall();
  xPos += xSpeed;
  yPos += ySpeed;
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