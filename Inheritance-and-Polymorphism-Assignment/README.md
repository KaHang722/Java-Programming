Create this list of classes and interfaces:
• Shape Class: abstract class with String name and one-argument constructor.
• Drawable interface, has one draw function – take no arguments and return void
• Holdable interface, has one hold function – take no arguments and return void
• TwoDShape Class: abstract class extends from Shape class and implements Drawable interface
(function draw will implemented in subclasses), it has one double attribute (area) and a onearguments constructor (name).
• ThreeDShape class: abstract Class extends from Shape class and implements Holdable interface,
it has one weight attribute and a two-arguments constructor (name, weight)
o implement hold function in this class which prints if the shape is holdable or not
depending on the weight (the shape is holdable if its weight is less than 25).
o Add an abstract function public abstract double calculateVolume();
• Line Class extends from TwoDShape with one int length attribute, this class has two-arguments
constructor (update area attribute in the constructor to be 0) and overrides the required
function (draw) which will draw the line with specific length.
• Rectangle Class extends from TwoDShape with two attributes width and height, this class has
three-arguments constructor (update area attribute in the constructor) and overrides the
required function (draw) which will draw a rectangle in the console.
• Sphere Class extends from ThreeDShape with one attribute (radius), this class has threearguments constructor (name, weight and radius) and overrides the abstract function
(calculateVolume) which will return the volume of the sphere.
• Cube Class extends from ThreeDShape with one attribute (edge), this class has three-arguments
constructor (name, weight and edge) and overrides the abstract function (calculateVolume)
which will return the volume of the Cube.
• Look at the provided main class, to build the correct classes and interfaces
• Implement toString function in all classes
o In Line, it should show the length of the line.
o In Rectangle it should show the area of the Rectangle.
o In Sphere and Cube, it should show the volume of the shape.
