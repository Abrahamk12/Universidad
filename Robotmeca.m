a=arduino
s1=servo(a,'D3')
s2=servo(a,'D8')
s3=servo(a,'D9')
k=2.5;
for i=0:500
     
    v1=readVoltage (a, 'A0');
    v2=readVoltage (a, 'A1');
    v3=readVoltage (a, 'A2');
    
    if(v1>k)
        v1=k;
    end
    
    if (v2>k)
        v2=k;
    end
    
    if(v3>k)
        v3=k;
    end
   
    writePosition(s1, v1/k);
    writePosition(s2, v2/k);
    writePosition(s3, v3/k);
    
end
clear all; 