1. download the zip from https://github.com/codeontology/parser

2. change the pom.xml =>

```bash
<dependency>
            <groupId>org.eclipse.jdt</groupId>
            <artifactId>org.eclipse.jdt.core</artifactId>
            <version>3.12.3</version>
</dependency>
```

it had 3.12.0. something that doesn't exists in the website, so i changed the version and it worked.

** update from 9/3/2020 => use 3.13.0 instead of 3.12.3. Also replace http with https for spring repo

3. <i>./codeontology -h</i> for help

4. copy a project folder in the perser directory and run :

<i>./codeontology -i folder_name -o output_file_name_with .nt extension -vf --dependencies</i>