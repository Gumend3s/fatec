@ECHO off 

SET /p name=Digite o caminho/nome da pasta que deseja copiar: 
md backup
c:\Windows\System32\xcopy %name%\* backup /s 
