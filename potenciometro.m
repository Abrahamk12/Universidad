a=arduino

for i = 0:600
    
    v=readVoltage (a, 'A0');
    
    writePWMDutyCycle(a,'D5',(v/5));
end
clear all; 