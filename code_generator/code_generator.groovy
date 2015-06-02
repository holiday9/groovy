#!/usr/bin/env groovy
import org.codehaus.groovy.runtime.InvokerHelper
class CodeGenerator extends Script {
    def run() {
        println 'code generator'
        
        this.args.each {
            println it
        }

    }   

    static void main(String[] args) {
        InvokerHelper.runScript(CodeGenerator, args);
    }

}
