package week01.theMOP

String.metaClass.americanise = {
    matcher = (delegate =~ /ise/)
    matcher.replaceAll('ize')
}

println('finalise'.americanise())