# INFO5100_FinalProject

### Application Name: Infectious Disease Control System

The purpose of infectious disease control system is to respond to, manage and control multiple infectious diseases, which is still an important problem globally. This application organizes and manages the resources and efforts of different operational units, allowing timely updating and transmission of information to achieve better infectious disease control.



### User-cases

In certain countries or regions, provide information management for COVID-19 emergency control to city administration department. Can be used by hospital, community, police, vaccine, transportation and accommodation units.



### Design overview

The design of  the application includes 4 Enterprises, 6 Organizations, and 9 Roles. System Administrator has the rights to manage organizations and city information, and all user information. It can also see the report of the application. Users of other roles can select roles and sign up their own accounts. After verifying by System Administrator, Users can use the corresponding functions of the application.



### Players and their contributions

**Hospital Operating Enterprise**: Manage hospital system information and treat patients in infectious disease events.

- Hospital

  -- Hospital Admin: Manage received community work requests, assign requests to doctor, manage doctor users

  -- Doctor: Accept, Reject, Process, and Complete requests from Hospital Admin

**Public Health Operating Enterprise**: Manage the public health information of the community. Community sends requests to all different units. Police is responsible for policing the community. Vaccine Unit is responsible for vaccinating the entire community to control infectious diseases.

- Community

  -- Community Head: Manage requests, creat and send requests to all different units

- Police

  -- Police Head: Manage received community work requests and Accept, Reject, Process, Complete requests

- Vaccinate Unit

  -- Vaccinate Head:  Manage received community work requests and Accept, Reject, Process, Complete requests

**Transportation Operating Enterprise**: Manage emergency transportation system information and transporting patients.

- Emergency Vehicle


  -- Car Admin: Manage received community work requests, assign requests to driver, manage driver users

  -- Driver: Accept, Reject, Process, and Complete requests from Car Admin

**Accommodation Operating Enterprise**: Manage emergency accommodation system information and provide isolation accommodation for patients.

- Emergency Shelter

  -- Hotel Head：Manage received community work requests and Accept, Reject, Process, Complete requests
  
  

![design1](https://user-images.githubusercontent.com/117139088/206917848-3d2f6369-6e3b-43b4-894a-6dd2e7260804.jpeg)


### UML diagram

<img width="763" alt="UML3" src="https://user-images.githubusercontent.com/117139088/206923743-201abed3-e919-4806-b50f-ae456d9c7773.png">  

 

![Sequence Diagram - 5100 final project](https://user-images.githubusercontent.com/98193797/206948621-a6381cdb-bc5d-4eb7-b6b0-04c58188626d.png)  





### Implementation techniques

Java, MySQL, Google Map API, Email Verification, HTML, Junit test

**Required .jar**

commons-logging-1.2.jar  
itextpdf-5.4.0.jar  
jakarta.activation-1.2.1.jar  
jakarta.mail-1.6.7.jar  
jcalendar-1.4.jar  
jcommon-1.0.23.jar  
jfreechart-1.0.19.jar  
jxbrowser-7.28.1.jar  
jxbrowser-javafx-7.28.1.jar  
jxbrowser-mac-7.28.1.jar  
jxbrowser-mac-arm-7.28.1.jar  
jxbrowser-swing-7.28.1.jar  
jxbrowser-swt-7.28.1.jar  
jxmapviewer2-2.6.jar  
mysql-connector-java-8.0.30.jar  



### Contributors

Yanyan Chen (002799697): The entire model design and implementation, the coding of all six workflows, the design of all databases, the output stream of pdf files, and the overall data statistics panel

Xiaoya Geng (002749444): The email verification of sign up and assignments design and implementation, the police related workflow, the design documents description, the UML class diagram drawing, and bug testing

Xiaodi Huang(002922334): The google maps for signup design and implementation, the map view of request and assigning user design and implementation, the Junit tests design and implementation, the database view and operation for admins with enterprise employees implementation, the models, the sequence diagram drawing, and bug testing
