a=arduino();


for i=0:500
    v=readVoltage(a,'A0')
    
    b=roumd(v);
    b=dec2bin(b,4);
    z=b=='1'
    writeDigitalPin(a,'D5',z(1));
    writeDigitalPin(a,'D6',z(2));
    writeDigitalPin(a,'D7',z(3));
    writeDigitalPin(a,'D8',z(4));
    
    writePWMDutyCycle(a,'D3',(v/5));
end