a=arduino();

for i=0:500
    
     v=readVoltage(a,'A2');
     plot(v,'-or');
     pause (0.1);
     
end
clear all;