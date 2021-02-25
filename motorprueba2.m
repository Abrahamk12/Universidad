a=arduino

n(1)=readDigitalPin(a,'D6')
n(2)=readDigitalPin(a,'D7')
n(3)=readDigitalPin(a,'D8')
n(4)=readDigitalPin(a,'D9')

for i= 0:250
n(1)=readDigitalPin(a, 'D6')
n(2)=readDigitalPin(a, 'D7')
n(3)=readDigitalPin(a, 'D8')
n(4)=readDigitalPin(a, 'D9')

z=n(1)*1+n(2)*2+n(3)*4+n(4)*8;

writePWMDutyCycle(a,'D5',(z/15));
 pause (0.2)
end
clear all
