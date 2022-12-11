# INFO5100_FinalProject

### Application Name: Infectious Disease Control System

The purpose of infectious disease control system is to respond to, manage and control multiple infectious diseases, which is still an important problem globally. This application organizes and manages the resources and efforts of different operational units, allowing timely updating and transmission of information to achieve better infectious disease control.



### User-cases

In certain countries or regions, provide information management for COVID-19 emergency control to city administration department. Can be used by hospital, community, police, vaccine, transportation and accommodation units.



### Design overview

The design of  the application includes 4 Enterprises, 6 Organizations, and 9 roles. System Administrator has the rights to manage organizations and city information, and all user information. Users of other roles can select roles and sign up their own accounts. After verifying by System Administrator, Users can use the corresponding functions of the application.



### Players and their contributions

**Hospital Operating Enterprise**: Manage hospital system information and treat patients in infectious disease events.

- Hospital

  -- Hospital Admin: Manage received community work requests, assign requests to doctor, manage doctor users

  -- Doctor: Accept, Reject, Process, and Complete requests from Hospital Admin

**Public Health Operating Enterprise**: Manage the public health information of the community. Community sends requests to all different units. Police is responsible for policing the community. Vaccine Unit is responsible for vaccinating the entire community to control infectious diseases.

- Community

  -- Community Head: Manage received community work requests and Accept, Reject, Process, and Complete requests

- Police

  -- Police Head: Manage received community work requests and Accept, Reject, Process, and Complete requests

- Vaccinate Unit

  -- Vaccinate Head:  Manage received community work requests and Accept, Reject, Process, and Complete requests

**Transportation Operating Enterprise**: Manage emergency transportation system information and transporting patients.

- Emergency Vehicle


  -- Car Admin: Manage received community work requests, assign requests to driver, manage driver users

  -- Driver: Accept, Reject, Process, and Complete requests from Car Admin

**Accommodation Operating Enterprise**: Manage emergency accommodation system information and provide isolation accommodation for patients.

- Emergency Shelter

  -- Hotel Head

  

![design1](https://user-images.githubusercontent.com/117139088/206917848-3d2f6369-6e3b-43b4-894a-6dd2e7260804.jpeg)


**UML diagram**

<img width="763" alt="UML3" src="https://user-images.githubusercontent.com/117139088/206923743-201abed3-e919-4806-b50f-ae456d9c7773.png">




### Implementation techniques

Java, MySQL, Google Map API, Email Verification, HTML, Junit test

