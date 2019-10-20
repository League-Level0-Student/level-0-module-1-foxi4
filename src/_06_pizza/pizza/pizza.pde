
import ddf.minim.*;     //at the top of the sketch
Minim minim;     //at the top of the sketch
AudioPlayer sound;    //at the top of the sketch
void setup() {
    size(1000, 800);
    minim = new Minim(this);      //in the setup method
sound = minim.loadFile("popsound.wav");      //in the setup method
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
if (mousePressed && (mouseButton== LEFT)){
PImage pepperoni = loadImage("pepperoni-2.png");
pepperoni.resize(75, 75);
image(pepperoni, 500, 200);
// Put next 2 lines where you want the sound to play
sound.play();
if (mousePressed && (mouseButton == RIGHT)){
PImage olive = loadImage("olive-clipart-1.png");
olive.resize(50, 60);
image(olive, 500, 500);
sound.play();

}}}
