package org.uml.explorer;

import java.awt.Image;
import org.openide.nodes.AbstractNode;
import org.openide.nodes.Children;
import org.openide.util.ImageUtilities;
import org.openide.util.lookup.AbstractLookup;
import org.openide.util.lookup.InstanceContent;
import org.uml.model.ClassDiagram;

/**
 *
 * @author Jelena
 */
public class ClassDiagramNode extends AbstractNode {

    private ClassDiagram classDiagram;
    private static String iconFolderPath = "org/uml/explorer/icons/";

    public ClassDiagramNode(ClassDiagram classDiagram) {
        this(classDiagram, new InstanceContent());
    }

    private ClassDiagramNode(ClassDiagram classDiagram, InstanceContent content) {
        // synchronous so that selection of members doesn't miss (if everything was not yet generated)
        super(Children.create(new ClassDiagramChildrenFactory(classDiagram), false), new AbstractLookup(content));        
        content.add(this);

        this.classDiagram = classDiagram;
        //this.setDisplayName(classDiagram.getName());
        this.setDisplayName(classDiagram.getName());
    }

//    @Override
//    protected Sheet createSheet() {
//
//        Sheet sheet = Sheet.createDefault();
//        Sheet.Set set = Sheet.createPropertiesSet();
//        set.setName("Class Diagram Properties");
//
//        try {
////            Node.Property label = new PropertySupport.Reflection(classDiagram, String.class, "getName", null);
////            Node.Property inputSize = new PropertySupport.Reflection(classDiagramComponent, Integer.class, "getInputSize", null);
////            Node.Property outputSize = new PropertySupport.Reflection(classDiagramComponent, Integer.class, "getOutputSize", null);
////            Node.Property size = new PropertySupport.Reflection(classDiagramComponent, Integer.class, "size", null);
////            label.setName("Label");
////            inputSize.setName("Input size");
////            outputSize.setName("Output size");
////            size.setName("Number of elements");
////            set.put(label);
////            set.put(inputSize);
////            set.put(outputSize);
////            set.put(size);
//        } catch (Exception ex) {
//            System.out.println(ex.getMessage());
//        }
//
//        sheet.put(set);
//        return sheet;
//    }
    
    public ClassDiagram getClassDiagram() {
        return classDiagram;
    }
    
    @Override
    public Image getIcon(int type) {
        return ImageUtilities.loadImage(iconFolderPath+"classDiagramIcon.png");
    }

    @Override
    public Image getOpenedIcon(int type) {
        return ImageUtilities.loadImage(iconFolderPath+"classDiagramIcon.png");
    }

}
