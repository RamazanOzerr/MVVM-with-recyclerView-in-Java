# MVVM-with-recyclerView-in-Java
This is a sample app that shows a list of programming languages with their names and logos. It is developed to create a sample for usage of MVVM (Model-View-ViewModel)
Architecture and recyclerView in android using java

# What is MVVM?
MVVM (Model-View-ViewModel) is an architectural pattern used for building user interfaces in Android applications.
It separates the user interface (View) from the data and business logic (Model), and introduces an intermediate layer called the ViewModel.

The ViewModel acts as a mediator between the View and the Model, and exposes data and behavior to the View via observable properties and commands. 
This enables the View to update itself automatically whenever the underlying data changes, and to trigger actions in the ViewModel when the user interacts with the View.

Overall, MVVM promotes a clear separation of concerns and facilitates testing and maintenance of the application code. It is widely used in Android development, 
especially with frameworks such as Android Architecture Components and Data Binding.

# What is recyclerView?
RecyclerView is a powerful and flexible widget in Android that provides a more efficient way to display large sets of data on the screen. 
It is an improvement over the older ListView and GridView widgets.

RecyclerView can be used to display a list of items in a vertical or horizontal scrolling list, and it supports multiple item types and layouts. 
It uses a ViewHolder pattern to efficiently reuse views as the user scrolls, reducing the memory usage and improving the performance of the application.

RecyclerView also provides built-in animations for adding, removing, and updating items in the list. 
It can be customized with various LayoutManagers to display items in a grid, staggered grid, or other customized layouts.

Overall, RecyclerView is a versatile and efficient widget that is widely used in Android app development for displaying lists and grids of data

# Which Technologies been used?
- Java 19
- MVVM Architecture
- Android Studio
- RecyclerView

# dependencies
- implementation 'de.hdodenhof:circleimageview:3.1.0'
    
# Screenshots
![ss1](https://user-images.githubusercontent.com/96844411/232143568-a866e1fb-3f19-4b48-81d8-3f30134f6c15.PNG)
![ss2](https://user-images.githubusercontent.com/96844411/232143588-259b1c54-f0cf-4f55-a131-ce2c4c6811f1.PNG)

# Did you find this repository helpful?
Do not forget to give a start

# Didn't you?
Then fork this repo, make it BETTER and do not forget to give a STAR
