#!/usr/bin/env groovy
def map = [:]
map."an identifier with a space and double quotes" = "ALLOWED"
map.'with-dash-signs-and-single-quotes' = "ALLOWED"

assert map."an identifier with a space and double quotes" == "ALLOWED"
assert map.'with-dash-signs-and-single-quotes' == "ALLOWED"

map./slashy string/
map.$/dfjalksdfjgfdsgkjd'g;gjdsfl;  jfdlsafj/$

def firstname = "Homer"
map."Simson-${firstname}" = "Homer Simson"

assert map.'Simson-Homer' == "Homer Simson"

def number = 3.14

def sParameterLessClosure = "1 + 2 == ${-> 3}" 
assert sParameterLessClosure == '1 + 2 == 3'

def sOneParamClosure = "1 + 2 == ${ w -> w << 3}" 
assert sOneParamClosure == '1 + 2 == 3'


def name = "Guillaume"
def date = "April, 1st"

def dollarSlashy = $/
    Hello $name,
    today we're ${date}.

    $ dollar sign
    $$ escaped dollar sign
    \ backslash
    / forward slash
    $/ escaped forward slash
    $/$ escaped dollar slashy string delimiter
/$


assert 1e3  ==  1_000.0
assert 2E4  == 20_000.0
assert 3e+1 ==     3_0.0
assert 4E-2 ==      0.04
assert 5e-1 ==      0.5

println ("test");
