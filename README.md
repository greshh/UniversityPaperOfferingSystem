# UniversityPaperOfferingSystem
***Start:** February 28<sup>th</sup> 2023, **Finish:** March 28<sup>th</sup> 2023*

For a second-year course: Object-Oriented Programming

## Scenario

The School of Mathematical and Computational Sciences (SMCS) provides several Information Science-related majors to undergraduate students. These majors are: Computer Science (CS), Information Technology (IT), Information Systems (IS), Software Engineering (SE), and Data Science (DS).

Each paper offered belongs to one or more majors and has a paper number (such as 159234) and a name. Each paper may include up to three assessment types (tests, assignments, exam), and each assessment type carries a particular weighting. Each paper is offered in all three of the following modes: internal Auckland, internal Palmerston North (PN), and distance. Each mode must be delivered by one lecturer.

Each lecturer is located at one of two campuses (Auckland or PN). A lecturer can only deliver an internal offering if it is located on his/her campus – but can deliver any distance offering. Each lecturer may deliver a minimum of zero offerings and a maximum of four offerings. Each lecturer’s biographical details (first name, last name, ID number, and campus) must be recorded.

The following papers are added in this system in the order `Number | Name | Major(s) | Assignments | Tests | Exams`:
```
158100 | Information Technology Principles           | IT, IS             | 70%  | 30% | 
158120 | Web-based IT Fundamentals                   | IT, IS             | 60%  | 40% | 
159101 | Applied Programming                         | IT, IS, CS, DS, SE | 50%  | 50% | 
159201 | Algorithms and Data Structures              | CS, DS, SE, IS     | 40%  | 20% | 40%
159234 | Object-Oriented Programming                 | CS, SE             | 50%  | 10% | 40%
158337 | Database Development                        | IT, SE, DS         | 60%  | 40% | 
158345 | Professionalism in the Information Sciences | IT, IS, CS, DS, SE | 100% |     | 
```

The following lectures are added in this system in the order `ID | First name | Last name | Campus`:
```
1105236  | Amy      | Sheffield | PN
1235894  | Victoria | Jensen    | PN
7225669  | James    | Lee       | PN
1328991  | Colin    | Delmont   | PN
1562347  | Thomas   | Becker    | Auckland
5664789  | Steven   | Hobbs     | Auckland
3658947  | Andrew   | Jackson   | Auckland
6332698  | Jonathon | Wood      | Auckland
12345678 | Mickey   | Mouse     | Auckland
22012395 | Greshka  | Lao       | Auckland
```

This program adds this system test data (papers and lecturers) as a hierarchy of classes (`School`, `Major`, `Paper`, `Assessment`, `PaperOffering`, `Lecturer`) and randomly assigns lecturers to each paper offering based on the rules specified in the School.

Its output will be the following (in order):
1. Full name of the school
2. All papers' details (including paper number, name, and majors it belongs to)
3. All papers belonging to Computer Science (CS) - my real major.
4. All papers that have an exam
5. All papers whose assignments weigh more than 50% in total
6. All paper offerings including paper number, offering mode, and lecturer
7. The paper offerings lecturer 'Greshka Lao' teaches.
8. The lecturer's name of Auckland offering 159234

## What I learnt:
- Class design (data fields, methods, constructors)
- Encapsulation - proper use of modifiers (private, protected, public)
- Information storage - using Array to store information, and use of get and set methods when appropriate
