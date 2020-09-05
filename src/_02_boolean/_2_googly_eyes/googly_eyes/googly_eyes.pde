PImage face;
void setup() {
  face = loadImage("face.jpeg");
  size(800, 600);
  face.resize(800,600);
}

void draw() {
  background(face);
  fill(255, 255, 255);
  ellipse(452, 210, 110, 150);
  fill(0, 0, 0);
  if(mouseX <= 410) {
    mouseX=410;
  }
  if(mouseX >= 490) {
    mouseX=490;
  }
  if(mouseY >= 245) {
    mouseY = 245;
  }
  if(mouseY<= 165) {
    mouseY = 165;
  }
  
  ellipse(mouseX, mouseY, 25, 25);
  fill(255, 255, 255);
  ellipse(538, 230, 110, 150);
  fill(0, 0, 0);
  ellipse(mouseX+86, mouseY+20, 25, 25);
  
}
