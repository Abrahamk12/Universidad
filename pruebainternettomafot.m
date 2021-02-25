w=ipcam('http://192.168.1.178:8080/video')

for i=1:100
img=snapshot(w);

imshow(img);
end
clear w;