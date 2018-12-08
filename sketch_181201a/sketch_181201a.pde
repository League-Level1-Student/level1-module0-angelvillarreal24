float xPos, yPos, score;
void setup() {
  size(1000, 1000); 
  xPos = width/2;
}
void draw() {
  background(160, 160, 160);
  fill(0, 0, 255);
  stroke(0);
  ellipse(xPos, yPos, 50, 75);
  fill(0);
  rect(mouseX-100, 900, 200, 100);
  yPos += 20;
  fill(0, 0, 0);
  textSize(32);
  text("Score: " + score, 20, 32);
  if (yPos==1000) {
    if(score>0){
     score--; 
    } 
    yPos = 0;
    xPos = random(100, 900);
  }
  if (keyPressed) {
    yPos = 0;
    xPos = random(100, 900);
    //control
  }
  if (xPos < mouseX+100 && xPos > mouseX-100 && yPos < 1000 && yPos > 900) {
    score++;
        yPos = 0;
    xPos = random(100, 900);
  } 
  }