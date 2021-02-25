img=imread('estacionamiento4.jpeg');
imshow(img);

a=rgb2gray("estacionamiento2.jpeg");

net=alexnet;
pred=classify(net, img);

Ly=net.Layers
fLy=Ly(1)
inz=fLy.InputSize
oLy=Ly(end)
imgi= imcrop(img,[ ]);