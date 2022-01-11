# Git

Git is a distributed version control system designed to help manage your coding projects.

---

### Vocab terms

- **Version Control System**
  - Version control systems are a category of software tools that helps in recording changes made to files by keeping a track of modifications done to the code.
  - [What is VCS?](https://www.geeksforgeeks.org/version-control-systems/)
- **DVCS**
  - Stands for _distributed version control system_. This is a type of VCS that allows multiple users to have different versions of the code base at the same time with no clear version of truth.
  - In practice, there exists a stable version of the code that other versions branch from and eventually merge back into. This working version is the main product that is being developed by a team of devs.

---

## Repository

This is where your coding project is stored. There are two kinds:

1. Local
   - Located in your machine.
2. Remote
   - Located somewhere on the interwebs. Usually accessed through some online repository webapp such as Github or Gitlab.

Locally speaking, a repository is nothing more than a special folder that you keep files you want to record changes to. What makes this folder special is a hidden .git folder that transforms a regular folder to a local git repo. (You can think of the hidden .git folder as the msg of repos) This means that every change in the folder gets noticed and could be recorded if you so choose.

### Creating a repository

1. Log in to github
2. Navigate to our organization
3. Click on the green button with the book icon that says `New`
4. Fill out the form. Name your repo following the format: `<LastName>-<FirstName>-Code`.
   - For example:
     - Nolasco-Marielle-Code
5. Don't add a readme.md
6. Click on the green create button to create your new repo!
7. Pat yourself on the back for creating your very first repository.

**Q**: But the repo is online? How do i get it on my machine???

**A**: Two ways:

1. You can create one locally using the cmd line or
2. You can clone a remote one and have a copy of that in your machine.

---

### Tools of the trade

**Github desktop** is a tool that allows you to manage your git repositories. It has features that integrate with github allowing you to easily clone remote repositories as well as drag and drop functionality for your local ones. Go get yourself a copy here: [Github Desktop](https://desktop.github.com/)

---
