a=arduino();
c=webcam();

for i=0:300
    
    if (readDigitalPin(a,'D3'))
        im=snapshot(c);
    else
        im=0;
    end
    image(im);
    drawnow;
end
 