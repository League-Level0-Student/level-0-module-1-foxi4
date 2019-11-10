 void setup(){
     size(750, 750);
   PImage face = loadImage("scarypotato.jpeg");
   face.resize(750, 750);
image(face, 0, 0);
 
       
 
    }

    void draw(){
      fill(#050505);
ellipse(315, 295, 144, 144);
ellipse(520, 270, 130, 130);

fill(#FF0900);
ellipse(315,295,4,4);

ellipse(520,270,3,3);

    }
                            
