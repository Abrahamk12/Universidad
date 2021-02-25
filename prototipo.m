Is = '*.jpg';
categorynames = net.Layers(end).ClassNames;

deepnet=alexnet;

img=imread('Estacionamiento.jpg');
imshow(img);
img1=imread('estacionamiento2.jpeg');
imshow(img1);
img2=imread('estacionamiento3.jpeg');
imshow(img2);

%Detect MSER regions.
[mserRegions, mserConnComp]= detectMSERFeatures(img, ...
    'RegionAreaRange', [100 800],'ThresholdDelta',4);

figure
hold on
plot(mserRegions, 'showPixelList', true,'showEllipses',false)
title('MSER regions')
hold off

