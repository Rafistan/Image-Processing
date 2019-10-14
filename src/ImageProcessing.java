
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 * 
 * @author RaffiStepanians Adriano Panaccione
 */
public class ImageProcessing extends javax.swing.JFrame
{
    private BufferedImage img, outputImage, imageTemp;
    
    public ImageProcessing(String filename)
    {   
        img = null;
        try {                
            img = ImageIO.read(new File(filename));
            repaint();
        } catch (IOException ex) {
            //ImageGUI.displayError("Couldn't load image: " + filename);
        }
             
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        editedImage = new javax.swing.JPanel();
        imagePanel2 = new ImagePanel();
        greyCheck = new javax.swing.JCheckBox();
        gaussianCheck = new javax.swing.JCheckBox();
        edgeCheck = new javax.swing.JCheckBox();
        boxCheck = new javax.swing.JCheckBox();
        messageLabel = new javax.swing.JLabel();
        gaussianLabel = new javax.swing.JLabel();
        edgeLabel = new javax.swing.JLabel();
        boxLabel = new javax.swing.JLabel();
        greyLabel = new javax.swing.JLabel();
        gammaLabel = new javax.swing.JLabel();
        slider = new javax.swing.JSlider();
        openButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        applyButton = new javax.swing.JButton();
        defaultImage = new javax.swing.JPanel();
        imagePanel1 = new ImagePanel();
        gammaValue = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        openMenu = new javax.swing.JMenuItem();
        saveMenu = new javax.swing.JMenuItem();
        exitMenu = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout imagePanel2Layout = new javax.swing.GroupLayout(imagePanel2);
        imagePanel2.setLayout(imagePanel2Layout);
        imagePanel2Layout.setHorizontalGroup(
            imagePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 308, Short.MAX_VALUE)
        );
        imagePanel2Layout.setVerticalGroup(
            imagePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 207, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout editedImageLayout = new javax.swing.GroupLayout(editedImage);
        editedImage.setLayout(editedImageLayout);
        editedImageLayout.setHorizontalGroup(
            editedImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imagePanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        editedImageLayout.setVerticalGroup(
            editedImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imagePanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        messageLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        messageLabel.setText("Welcome to Image Processing");

        gaussianLabel.setText("Gaussian Filter:");

        edgeLabel.setText("Edge Detection Filter:");

        boxLabel.setText("Box Filter:");

        greyLabel.setText("Convert to grey scales:");

        gammaLabel.setText("Gamma correction:");

        slider.setValue(10);
        slider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderStateChanged(evt);
            }
        });

        openButton.setText("Open");
        openButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openButtonActionPerformed(evt);
            }
        });

        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        applyButton.setText("Apply");
        applyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                applyButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout imagePanel1Layout = new javax.swing.GroupLayout(imagePanel1);
        imagePanel1.setLayout(imagePanel1Layout);
        imagePanel1Layout.setHorizontalGroup(
            imagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        imagePanel1Layout.setVerticalGroup(
            imagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout defaultImageLayout = new javax.swing.GroupLayout(defaultImage);
        defaultImage.setLayout(defaultImageLayout);
        defaultImageLayout.setHorizontalGroup(
            defaultImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(defaultImageLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imagePanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        defaultImageLayout.setVerticalGroup(
            defaultImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imagePanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        gammaValue.setText("1.0");

        jMenu1.setText("File");

        openMenu.setText("Open");
        openMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openMenuActionPerformed(evt);
            }
        });
        jMenu1.add(openMenu);

        saveMenu.setText("Save");
        saveMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveMenuActionPerformed(evt);
            }
        });
        jMenu1.add(saveMenu);

        exitMenu.setText("Exit");
        exitMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuActionPerformed(evt);
            }
        });
        jMenu1.add(exitMenu);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(openButton, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(defaultImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(editedImage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(applyButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(messageLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(gaussianLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(boxLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(edgeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(greyLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(gammaLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(gammaValue)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(greyCheck)
                                            .addComponent(gaussianCheck)
                                            .addComponent(edgeCheck)
                                            .addComponent(boxCheck)
                                            .addComponent(slider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(editedImage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(defaultImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(messageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(openButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boxLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(boxCheck)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(gaussianCheck)
                    .addComponent(gaussianLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(edgeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edgeCheck))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(gammaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(slider, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gammaValue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(greyLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(greyCheck))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(applyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        JFileChooser saveFile = new JFileChooser();
        saveFile.setCurrentDirectory(new File("images"));
        
        if(saveFile.showSaveDialog(null) == JFileChooser.APPROVE_OPTION)
        {
            File outputFile = saveFile.getSelectedFile();
            String filename = outputFile.getAbsolutePath();
            
            if(!filename.contains(".png"))
                filename += ".png";
            
            try {
                File output = new File(filename);
                ImageIO.write(outputImage, "png", output);
                messageLabel.setText("Image successfully saved!");
            } catch (IOException ex) {
                messageLabel.setText("Image not saved!");
            }
        }
    }//GEN-LAST:event_saveButtonActionPerformed

    private void openButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openButtonActionPerformed
        JFileChooser openFile = new JFileChooser();
        openFile.setCurrentDirectory(new File("images"));
        String[] imageFormats = new String[] {"jpg", "jpeg", "bmp", "png"};
        FileFilter filter = new FileNameExtensionFilter("Image file", imageFormats);
        
        openFile.setFileFilter(filter);
        openFile.addChoosableFileFilter(filter);
        
        if(openFile.showOpenDialog(null) == JFileChooser.APPROVE_OPTION)
        {
            String filename = openFile.getSelectedFile().getPath();
            
            imagePanel1.setImage(filename);
            imagePanel2.setImage(filename);
            
            messageLabel.setText("Image successfully opened!");
        }
        
        img = imagePanel1.getBufferedImage();
        
    }//GEN-LAST:event_openButtonActionPerformed

    private void applyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_applyButtonActionPerformed
        try{
            if(boxCheck.isSelected())
                applyBoxFilter();

            if(gaussianCheck.isSelected())
                applyGaussianFilter();

            if(edgeCheck.isSelected())
                applyEdgeFilter();

            
            if(greyCheck.isSelected())
                applyGreyFilter();
            
            applyGammaFilter();

            
            imageTemp = null;
            
            messageLabel.setText("Image successfully processed!");
        }catch(Exception e){
            messageLabel.setText("Error: Failed to process image!");
        }
    }//GEN-LAST:event_applyButtonActionPerformed

    private void saveMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveMenuActionPerformed
        saveButtonActionPerformed(evt);
    }//GEN-LAST:event_saveMenuActionPerformed

    private void exitMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuActionPerformed
        System.exit(-1);
    }//GEN-LAST:event_exitMenuActionPerformed

    private void openMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openMenuActionPerformed
        openButtonActionPerformed(evt);
    }//GEN-LAST:event_openMenuActionPerformed

    private void sliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderStateChanged
        gammaValue.setText(String.format("%.1f", (slider.getValue())/10.0));
    }//GEN-LAST:event_sliderStateChanged

    public void applyBoxFilter()
    {
        float boxKernel[][] = new float[][]
        {
            {0.11111111f, 0.11111111f, 0.11111111f},
            {0.11111111f, 0.11111111f, 0.11111111f},
            {0.11111111f, 0.11111111f, 0.11111111f}
        };
        
        ApplyConvolutionFilter(boxKernel);
    }
    
    public void applyGaussianFilter()
    {
        float gaussianKernel[][] = new float[][]
        {
            {0.00000067f, 0.00002292f, 0.00019117f, 0.00038771f, 0.00019117f, 0.00002292f, 0.00000067f},
            {0.00002292f, 0.00078634f, 0.00655965f, 0.01330373f, 0.00655965f, 0.00078633f, 0.00002292f},
            {0.00019117f, 0.00655965f, 0.05472157f, 0.11098164f, 0.05472157f, 0.00655965f, 0.00019117f},
            {0.00038771f, 0.01330373f, 0.11098164f, 0.22508352f, 0.11098164f, 0.01330373f, 0.00038771f},
            {0.00019117f, 0.00655965f, 0.05472157f, 0.11098164f, 0.05472157f, 0.00655965f, 0.00019117f},
            {0.00002292f, 0.00078634f, 0.00655965f, 0.01330373f, 0.00655965f, 0.00078633f, 0.00002292f},
            {0.00000067f, 0.00002292f, 0.00019117f, 0.00038771f, 0.00019117f, 0.00002292f, 0.00000067f}
        };
        
        ApplyConvolutionFilter(gaussianKernel);
    }
    
    public void applyEdgeFilter()
    {
        float edgeKernel[][] = new float[][]
        {
            {-1f, -1f, -1f},
            {-1, 8f, -1f},
            {-1f, -1f, -1f}
        };
        
        ApplyConvolutionFilter(edgeKernel);
    }
    
    public void applyGammaFilter()
    {
        //BufferedImage image = new BufferedImage(img.getWidth(), img.getHeight(), img.getType());
       
        BufferedImage image = null;
        boolean empty = false;
        
        //Determine if Buffered image comes from img or imageTemp
        if(imageTemp == null)
            image = new BufferedImage(img.getWidth(), img.getHeight(), img.getType());
        else if(imageTemp != null)
        {
            image = new BufferedImage(imageTemp.getWidth(), imageTemp.getHeight(), imageTemp.getType());
            empty = true;
        }
        
        int width = image.getWidth();
        int height = image.getHeight();
       
        for(int i = 0; i < width; i++)
        {
            for(int j = 0; j < height; j++)
            {
                //int pixel = img.getRGB(i, j);
                 
                int pixel = 0;
                
                if(empty)
                    pixel = imageTemp.getRGB(i, j);
                else if(empty == false)
                    pixel = img.getRGB(i, j);
                
                
                Color rgb = new Color(pixel);
                
                float[] hsb = Color.RGBtoHSB(rgb.getRed(), rgb.getGreen(), rgb.getBlue(), null);
                
                float hue = hsb[0];
                float saturation = hsb[1];
                float brightness = hsb[2];
                
                double gamma = slider.getValue() * 1.0/10;
                
                brightness = (float)Math.pow(brightness, gamma);
                
                int corrected = Color.HSBtoRGB(hue, saturation, brightness);
                
                image.setRGB(i, j, corrected);
            }
        }
        imagePanel2.setImage(image);
        outputImage = image;
    }
    
    public void applyGreyFilter()
    {
        BufferedImage image = null;
        boolean empty = false;
        
        //Determine if Buffered image comes from img or imageTemp
        if(imageTemp == null)
            image = new BufferedImage(img.getWidth(), img.getHeight(), img.getType());
        else if(imageTemp != null)
        {
            image = new BufferedImage(imageTemp.getWidth(), imageTemp.getHeight(), imageTemp.getType());
            empty = true;
        }
        
        int width = image.getWidth();
        int height = image.getHeight();
        for(int i = 0; i < width; i++)
        {
            for(int j = 0; j < height; j++)
            {
                int pixel = 0;
               
                //get pixel from imageTemp or img
                if(empty)
                    pixel = imageTemp.getRGB(i, j);
                else if(empty == false)
                    pixel = img.getRGB(i, j);
                    
                int alpha = (pixel>>24) & 0xff;
                int red = (pixel>>16) & 0xff;
                int green = (pixel>>8) & 0xff;
                int blue = pixel & 0xff;
                
                int avg = (red + green + blue)/3;
                
                pixel = (alpha<<24) | (avg<<16) | (avg<<8) | (avg);
                
                image.setRGB(i, j, pixel);
            }
        }
        imageTemp = image;
        
        imagePanel2.setImage(image);
        outputImage = image;
        
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new ImageProcessing("images/noimage.png").setVisible(true);
            }
        });
    }

    public void ApplyConvolutionFilter(float[][] kernel)
    {
        BufferedImage Image = new BufferedImage(img.getWidth(), img.getHeight(), img.getType());
        
        // Set output image from input image (img)
        for (int j=0; j<img.getHeight(); ++j)
        {
            for (int i=0; i<img.getWidth(); ++i)
            {
                // Calculate the gaussian blur
                Color pixelColor = ApplyKernel(kernel, i, j);
                Image.setRGB(i, j, pixelColor.getRGB());
            }
        }
        imageTemp = Image;
        
        imagePanel2.setImage(Image);
        outputImage = Image;
    }
    
    private Color ApplyKernel(float[][] kernel, int row, int column)
    {
        float red = 0.0f;
        float green = 0.0f;
        float blue = 0.0f;

        int minIndexH = -(kernel.length / 2);
        int maxIndexH = minIndexH + kernel.length;
        int minIndexV = -(kernel[0].length / 2);
        int maxIndexV = minIndexV + kernel[0].length;
        
        for (int i = minIndexH; i < maxIndexH; ++i)
        {
            for (int j=minIndexV; j<maxIndexV; ++j)
            {
                int indexH = WrapHorizontalIndex(row + i);
                int indexV = WrapVerticalIndex(column + j);
                Color col = new Color(img.getRGB(indexH, indexV));

                red += col.getRed() * kernel[i-minIndexH][j-minIndexV];
                green += col.getGreen() * kernel[i-minIndexH][j-minIndexV];
                blue += col.getBlue() * kernel[i-minIndexH][j-minIndexV];
            }
        }

        red = Math.min(Math.max(red, 0.0f), 255.0f);
        green = Math.min(Math.max(green, 0.0f), 255.0f);
        blue = Math.min(Math.max(blue, 0.0f), 255.0f);
        
        return new Color((int) red, (int) green, (int) blue);
    }
    
    private int WrapHorizontalIndex(int i)
    {
        // This takes care of negative and positive indices beyond the image resolution
        return (i + img.getWidth()) % img.getWidth();
    }

    private int WrapVerticalIndex(int i)
    {
        // This takes care of negative and positive indices beyond the image resolution
        return (i + img.getHeight()) % img.getHeight();
    }
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton applyButton;
    private javax.swing.JCheckBox boxCheck;
    private javax.swing.JLabel boxLabel;
    private javax.swing.JPanel defaultImage;
    private javax.swing.JCheckBox edgeCheck;
    private javax.swing.JLabel edgeLabel;
    private javax.swing.JPanel editedImage;
    private javax.swing.JMenuItem exitMenu;
    private javax.swing.JLabel gammaLabel;
    private javax.swing.JLabel gammaValue;
    private javax.swing.JCheckBox gaussianCheck;
    private javax.swing.JLabel gaussianLabel;
    private javax.swing.JCheckBox greyCheck;
    private javax.swing.JLabel greyLabel;
    private ImagePanel imagePanel1;
    private ImagePanel imagePanel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel messageLabel;
    private javax.swing.JButton openButton;
    private javax.swing.JMenuItem openMenu;
    private javax.swing.JButton saveButton;
    private javax.swing.JMenuItem saveMenu;
    private javax.swing.JSlider slider;
    // End of variables declaration//GEN-END:variables
}
