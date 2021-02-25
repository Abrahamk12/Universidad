a=arduino 

for i=0:20
    
writePWMVoltage(a,'D5',i/20);
pause(.3);
writeDigitalPin(a,'D5',0);
pause(.3);

end