a=arduino()

for i=0:20

    writeDigitalPin(a,'D5',1);
    pause(.3)
    writeDigitalPin(a,'D5',0);
    pause(.3);
    
end