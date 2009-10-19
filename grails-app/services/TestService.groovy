//import org.codehaus.groovy.grails.plugins.springsecurity.Secured;
import org.springframework.security.annotation.Secured;
import org.springframework.flex.remoting.RemotingDestination;
import org.springframework.flex.remoting.RemotingInclude;
import org.springframework.flex.remoting.RemotingExclude;

//@RemotingDestination(channels=["amf","secure-amf"])
class TestService {

	boolean transactional = true

	//@Secured(["ROLE_USER"])
	//@RemotingInclude
	def echo(txt) {
		return "Grails -> "+txt;
	}
	
	//@RemotingExclude
	def majicEyesOnly() {
		return "Majestic 12";
	}
}
