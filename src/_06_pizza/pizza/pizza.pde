
void setup() {
    size(1000, 800);
}
void draw() {
    fill(#F0BC85);
ellipse(500, 350, 600, 600);
fill(#F2CCA4);
ellipse(500, 350, 550, 550);
fill(#E52817);
ellipse(500, 350, 525, 525);
fill(#FFEB03);
ellipse(500, 350, 510, 510);
if (mousePressed){
PImage pepperoni = loadImage("pepperoni-2.png");
pepperoni.resize(75, 75);
image(pepperoni, 500, 200);
if (mousePressed && (mouseButton == RIGHT))
//PImage olive = loadImage("olive-clipart-1.png");//
//image(olive, 50, 50);
}
}
