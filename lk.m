a=arduino()

for i =0:.1:1
    
writePWMDutyCycle(a,'D5',i);
pause(.3)
    
end