ORG 8000h

; Borde rojo
;LD A,2
;CALL 229Bh
;RET

; Usando OUT
; Color azul
LD A,1
OUT (254),A
RET
