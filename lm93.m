a=arduino

while(true)
   t=readVoltage (a, 'A0');
   t=t/0.01
    
   if (t>30)
       writeDigitalPin(a,'D5',1);
   else 
       writeDigitalPin(a,'D5',0);
   end
   writePWMDutyCycle(a,'D3',(t/70));
end
clear all; 