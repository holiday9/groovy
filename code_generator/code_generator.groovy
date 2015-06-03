#!/usr/bin/env groovy
import org.codehaus.groovy.runtime.InvokerHelper
class CodeGenerator extends Script {
    def run() {
        println 'code generator'
        
        println this.args[0]
        
    }   

    static void main(String[] args) {
        InvokerHelper.runScript(CodeGenerator, args);
    }

}
