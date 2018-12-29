float x, y;
void setup() {
  size(1000, 1000);
}
void draw() {
  background(0);
  makeMagical();
  for (int i = 1; i <= 300; i++) {
    fill(random(0, 255), i, 123);
    ellipse(getWormX(i), getWormY(i), 50, 50);
  }
}
float frequency = .001;
float noiseInterval = PI;

void makeMagical() {
  fill( 0, 0, 0, 10 );
  rect(0, 0, width, height);
  noStroke();
}

float getWormX(int i) {
  return map(noise(i*noiseInterval + frameCount * frequency), 0, 1, 0, width);
}

float getWormY(int i) {
  return map(noise(i*noiseInterval+1 + frameCount * frequency), 0, 1, 0, height);
}
//random(100,255), random(100,255)

